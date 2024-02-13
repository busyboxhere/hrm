import { Injectable, Logger } from '@nestjs/common';
import { Sequelize } from 'sequelize-typescript';

@Injectable()
export class AppService {
	private readonly logger = new Logger(AppService.name);
	constructor(private readonly sequelize: Sequelize) {}

	// async onModuleInit() {
	// 	await this.testDBConnection();
	// }

	// async testDBConnection() {
	// 	try {
	// 		await this.sequelize.authenticate();
	// 		this.logger.debug('Connsection has been established successfully.');
	// 	} catch (error) {
	// 		this.logger.error('Could not establish connection to database', [error]);
	// 	}
	// }

	async getHello() {
		return 'Hello World!';
	}
}
