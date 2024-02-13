import { Injectable } from '@nestjs/common';
import { Sequelize } from 'sequelize-typescript';

@Injectable()
export class DatabaseService {
	constructor(private readonly sequelize: Sequelize) {}

	establishConnection() {
		this.sequelize.connectionManager.getConnection({ type: 'write' });
	}
}
