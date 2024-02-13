import { Module } from '@nestjs/common';
import { EntitiesModule } from 'src/entities/entities.module';
import { UserManagementService } from './services/user-management/user-management.service';
import { UserManagementController } from './controllers/user-management/user-management.controller';

@Module({
	imports: [EntitiesModule],
	providers: [UserManagementService],
	controllers: [UserManagementController],
})
export class AdminModule {}
