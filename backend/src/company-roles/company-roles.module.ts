import { Module } from '@nestjs/common';
import { CompanyRolesService } from './company-roles.service';
import { CompanyRolesController } from './company-roles.controller';
import { SequelizeModule } from '@nestjs/sequelize';
import { CompanyRolesEntity } from './entities/company-roles.entity';

@Module({
	imports: [SequelizeModule.forFeature([CompanyRolesEntity])],
	controllers: [CompanyRolesController],
	providers: [CompanyRolesService],
})
export class CompanyRolesModule {}
