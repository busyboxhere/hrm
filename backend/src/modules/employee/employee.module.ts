import { Module } from '@nestjs/common';
import { SequelizeModule } from '@nestjs/sequelize';
import { EmployeeController } from './controllers/employee.controller';
import { EmploymentHistory } from './entity/employment-history.entity';
import { Employee } from './entity/employee.entity';
import { EmployeeAuth } from './entity/employee-auth/employee-auth';

@Module({
	controllers: [EmployeeController],
	imports: [SequelizeModule.forFeature([EmploymentHistory, Employee, EmployeeAuth])],
	exports: [SequelizeModule],
})
export class EmployeeModule {}
