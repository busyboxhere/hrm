import { BelongsTo, Column, DataType, ForeignKey, Model, Table } from 'sequelize-typescript';
import { Employee } from './employee.entity';

@Table({
	tableName: 'Attendance',
})
export class Attendance extends Model {
	@Column({ primaryKey: true, type: DataType.INTEGER, autoIncrement: true })
	id: number;

	@Column({ type: DataType.DATE, allowNull: false })
	in: string;

	@Column({ type: DataType.DATE, allowNull: false })
	out: string;

	@Column({ type: DataType.INTEGER, allowNull: false })
	overtimeHours: number;

	@ForeignKey(() => Employee)
	@Column({ type: DataType.INTEGER, allowNull: false })
	employeeID: number;

	@BelongsTo(() => Employee)
	employee: Employee;
}
