import { Module } from '@nestjs/common';
import { SequelizeModule } from '@nestjs/sequelize';
import { LeaveRecord } from '../../../../entities/leave-record.entity';

@Module({
	imports: [SequelizeModule.forFeature([LeaveRecord])],
})
export class LeaveManagementModule {}
