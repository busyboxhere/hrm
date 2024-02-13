import { Module } from '@nestjs/common';
import { LeaveRecordService } from './leave-record.service';
import { LeaveRecordController } from './leave-record.controller';
import { SequelizeModule } from '@nestjs/sequelize';
import { LeaveRecord } from './entities/leave-record.entity';

@Module({
	imports: [SequelizeModule.forFeature([LeaveRecord])],
	controllers: [LeaveRecordController],
	providers: [LeaveRecordService],
})
export class LeaveRecordModule {}
