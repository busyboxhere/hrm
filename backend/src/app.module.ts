import { Module } from '@nestjs/common';
import { ConfigModule, ConfigService } from '@nestjs/config';
import { SequelizeModule, SequelizeModuleOptions } from '@nestjs/sequelize';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { AttendanceModule } from './modules/attendance/attendance.module';
import { EmployeeModule } from './modules/employee/employee.module';
import { LeaveManagementModule } from './modules/leave-management/leave-management.module';
import { SharedModule } from './modules/shared/shared.module';

export const sequelizeConfigFactory = async (configService: ConfigService): Promise<SequelizeModuleOptions> => {
	return {
		dialect: 'mysql',
		host: configService.get<string>('DB_HOST'),
		port: configService.get<number>('DB_PORT'),
		username: configService.get<string>('DB_USERNAME'),
		password: configService.get<string>('DB_PASSWORD'),
		database: configService.get<string>('DB_NAME'),
		autoLoadModels: true,
		sync: { force: true },
		retryAttempts: 0,
	};
};

@Module({
	imports: [
		EmployeeModule,
		LeaveManagementModule,
		AttendanceModule,
		ConfigModule.forRoot({}),
		SequelizeModule.forRootAsync({
			imports: [ConfigModule],
			inject: [ConfigService],
			useFactory: sequelizeConfigFactory,
		}),
		SharedModule,
	],
	controllers: [AppController],
	providers: [AppService, ConfigService],
})
export class AppModule {}
