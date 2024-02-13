import { Module } from '@nestjs/common';
import { SequelizeModule } from '@nestjs/sequelize';
import { Attendance } from './attendance.entity';
import { CompanyRolesEntity } from './company-roles.entity';
import { EmployeeAuth } from './employee-auth';
import { Employee } from './employee.entity';
import { EmploymentHistory } from './employment-history.entity';
import { LeaveCategory } from './leave-category.entity';
import { LeaveRecord } from './leave-record.entity';

@Module({
	imports: [
		SequelizeModule.forFeature([Employee, Attendance, EmployeeAuth, EmploymentHistory, LeaveRecord, LeaveCategory, CompanyRolesEntity]),
	],
	exports: [SequelizeModule],
})
export class EntitiesModule {}
