import { Module } from '@nestjs/common';
import { ConfigModule, ConfigService } from '@nestjs/config';
import { SequelizeModule } from '@nestjs/sequelize';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { AttendanceModule } from './attendance/attendance.module';
import { AuthModule } from './auth/auth.module';
import { CompanyRolesModule } from './company-roles/company-roles.module';
import { EmployeeModule } from './employee/employee.module';
import { EmploymentHistoryModule } from './employment-history/employment-history.module';
import { LeavesModule } from './leaves/leaves.module';
import { sequelizeConfigFactory } from './sequelize-config.factory';
import { LeaveCategoryModule } from './leave-category/leave-category.module';
import { LeaveRecordModule } from './leave-record/leave-record.module';

@Module({
	imports: [
		ConfigModule.forRoot({}),
		SequelizeModule.forRootAsync({
			imports: [ConfigModule],
			inject: [ConfigService],
			useFactory: sequelizeConfigFactory,
		}),
		EmployeeModule,
		AttendanceModule,
		LeavesModule,
		CompanyRolesModule,
		AuthModule,
		EmploymentHistoryModule,
		LeaveCategoryModule,
		LeaveRecordModule,
	],
	controllers: [AppController],
	providers: [AppService, ConfigService],
})
export class AppModule {}
