import { Module } from '@nestjs/common';
import { EmploymentHistoryService } from './employment-history.service';
import { EmploymentHistoryController } from './employment-history.controller';
import { SequelizeModule } from '@nestjs/sequelize';
import { EmploymentHistory } from './entities/employment-history.entity';

@Module({
	imports: [SequelizeModule.forFeature([EmploymentHistory])],
	controllers: [EmploymentHistoryController],
	providers: [EmploymentHistoryService],
})
export class EmploymentHistoryModule {}
