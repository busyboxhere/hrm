import { Module } from '@nestjs/common';
import { AttendanceModule } from './modules/attendance/attendance.module';
import { LeaveManagementModule } from './modules/leave-management/leave-management.module';
import { EmployeeModule } from './modules/employee/employee.module';
import { EntitiesModule } from 'src/entities/entities.module';

@Module({
	imports: [EmployeeModule, LeaveManagementModule, AttendanceModule, EntitiesModule],
})
export class UserModule {}
