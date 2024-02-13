import { Module } from '@nestjs/common';
import { SequelizeModule } from '@nestjs/sequelize';
import { CompanyRolesEntity } from 'src/modules/shared/base-entities/company-roles.entity';
import { LeaveCategory } from 'src/modules/shared/base-entities/leave-category.entity';

@Module({
	imports: [SequelizeModule.forFeature([CompanyRolesEntity, LeaveCategory])],
	exports: [SequelizeModule],
})
export class SharedModule {}
