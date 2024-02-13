import { Controller } from '@nestjs/common';
import { Sequelize } from 'sequelize-typescript';

@Controller('employee')
export class EmployeeController {
	constructor(private readonly sequelize: Sequelize) {
		console.log(this.sequelize.models);
	}
	fetchAll() {
		this.sequelize.models;
	}
}
