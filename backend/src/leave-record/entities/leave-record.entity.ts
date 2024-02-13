import { BelongsTo, Column, DataType, ForeignKey, Model, Table } from 'sequelize-typescript';
import { Employee } from 'src/employee/entities/employee.entity';
import { LeaveCategory } from 'src/leave-category/entities/leave-category.entity';

@Table({
	tableName: 'LeaveRecordEntity',
})
export class LeaveRecord extends Model {
	@Column({ primaryKey: true, type: DataType.INTEGER, autoIncrement: true })
	leaveId: number;

	@Column({ type: DataType.INTEGER, allowNull: false })
	@ForeignKey(() => Employee)
	employeeId: number;

	@Column({ type: DataType.INTEGER, allowNull: false })
	@ForeignKey(() => LeaveCategory)
	leaveType: number;

	@Column({ type: DataType.STRING, allowNull: false })
	reason: string;

	@Column({ type: DataType.DATE, allowNull: false })
	startDate: string;

	@Column({ type: DataType.DATE, allowNull: false })
	endDate: string;

	@Column({ type: DataType.ENUM('Pending', 'Accepted', 'Rejected'), allowNull: false, defaultValue: 'Pending' })
	status: string;

	@BelongsTo(() => Employee)
	employee: Employee;

	@BelongsTo(() => LeaveCategory)
	leaveCategory: LeaveCategory;
}
