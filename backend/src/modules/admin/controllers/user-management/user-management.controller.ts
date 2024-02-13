import { Controller, Get, Logger } from '@nestjs/common';
import { UserManagementService } from '../../services/user-management/user-management.service';

@Controller('admin')
export class UserManagementController {
	private readonly logger = new Logger(UserManagementController.name);
	constructor(private readonly userManagementService: UserManagementService) {}

	@Get('fetchAllEmployees')
	fetchAllEmployees() {
		this.logger.debug('fetchAllEmployees()');
		return this.userManagementService.fetchAllEmployees();
	}
}
