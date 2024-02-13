import { BelongsTo, Column, DataType, ForeignKey, Model, Table } from 'sequelize-typescript';
import { Employee } from './employee.entity';
import { CompanyRolesEntity } from 'src/modules/shared/base-entities/company-roles.entity';

@Table({
	tableName: 'EmploymentHistory',
})
export class EmploymentHistory extends Model {
	@Column({ primaryKey: true, autoIncrement: true })
	id: number;

	@Column({ type: DataType.STRING, allowNull: false })
	prevEmployerName: string;

	@Column({ type: DataType.DATE, allowNull: false })
	prevEmploymentStartDate: Date;

	@Column({ type: DataType.DATE, allowNull: false })
	prevEmploymentEndDate: Date;

	@Column({ type: DataType.STRING, allowNull: false })
	remarks: string;

	@Column({ type: DataType.DATE, allowNull: false })
	joiningDate: Date;

	@ForeignKey(() => CompanyRolesEntity)
	@Column({ type: DataType.INTEGER, allowNull: false })
	currentPosition: number;

	@ForeignKey(() => CompanyRolesEntity)
	@Column({ type: DataType.INTEGER, allowNull: false })
	department: number;

	@ForeignKey(() => Employee)
	@Column({ type: DataType.INTEGER, allowNull: false })
	employeeID: number;

	@ForeignKey(() => Employee)
	@Column({ type: DataType.INTEGER, allowNull: false })
	reportingManager: number;

	@BelongsTo(() => Employee, { foreignKey: 'employeeID' /* targetKey: 'id' */ })
	employee: Employee;

	@BelongsTo(() => Employee, { foreignKey: 'reportingManager' /* targetKey: 'id'  */ })
	manager: Employee;

	@BelongsTo(() => CompanyRolesEntity, { foreignKey: 'currentPosition' /* targetKey: 'roleId' */ })
	position: CompanyRolesEntity;

	@BelongsTo(() => CompanyRolesEntity, { foreignKey: 'department' /*  targetKey: 'roleId'  */ })
	dept: CompanyRolesEntity;
}
