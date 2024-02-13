import { Module } from '@nestjs/common';
import { SequelizeModule } from '@nestjs/sequelize';
import { Attendance } from './entity/attendance.entity';

@Module({
	imports: [SequelizeModule.forFeature([Attendance])],
})
export class AttendanceModule {}
