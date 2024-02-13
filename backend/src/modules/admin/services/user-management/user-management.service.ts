import { Injectable } from '@nestjs/common';
import { InjectModel } from '@nestjs/sequelize';
import { Observable, from } from 'rxjs';
import { Employee } from 'src/entities/employee.entity';

@Injectable()
export class UserManagementService {
	constructor(
		@InjectModel(Employee)
		private readonly employeeModel: typeof Employee,
	) {}

	fetchAllEmployees(): Observable<Employee[]> {
		return from(this.employeeModel.findAll());
	}
}
