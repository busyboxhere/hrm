import { BelongsTo, Column, DataType, ForeignKey, Model, Table } from 'sequelize-typescript';
import { Employee } from 'src/employee/entities/employee.entity';

@Table({
	tableName: 'employeeAuth',
})
export class EmployeeAuth extends Model {
	@Column({ primaryKey: true, autoIncrement: true })
	id: number;

	@Column({ type: DataType.INTEGER, allowNull: false })
	@ForeignKey(() => Employee)
	employeeID: number;

	@Column({ type: DataType.STRING, allowNull: false })
	salt: string;

	@Column({ type: DataType.STRING, allowNull: false })
	passwordHash: string;

	@BelongsTo(() => Employee)
	employee: Employee;
}
