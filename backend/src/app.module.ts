import { Module } from '@nestjs/common';
import { ConfigModule, ConfigService } from '@nestjs/config';
import { SequelizeModule } from '@nestjs/sequelize';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { AdminModule } from './modules/admin/admin.module';
import { SharedModule } from './modules/shared/shared.module';
import { UserModule } from './modules/user/user.module';
import { sequelizeConfigFactory } from './sequelize-config.factory';
import { EntitiesModule } from './entities/entities.module';

@Module({
	imports: [
		UserModule,
		AdminModule,
		ConfigModule.forRoot({}),
		EntitiesModule,
		SharedModule,
		SequelizeModule.forRootAsync({
			imports: [ConfigModule],
			inject: [ConfigService],
			useFactory: sequelizeConfigFactory,
		}),
	],
	controllers: [AppController],
	providers: [AppService, ConfigService],
})
export class AppModule {}
