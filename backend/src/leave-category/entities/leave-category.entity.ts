import { Logger } from '@nestjs/common';
import { AfterSync, Column, DataType, Model, Table } from 'sequelize-typescript';

@Table({
	tableName: 'LeaveCategory',
})
export class LeaveCategory extends Model {
	private static readonly logger = new Logger(LeaveCategory.name);
	@Column({ primaryKey: true, autoIncrement: true, type: DataType.INTEGER })
	id: number;

	@Column({ type: DataType.STRING, allowNull: false })
	leaveType: string;

	@Column({ type: DataType.STRING, allowNull: false })
	description: string;

	// @HasMany(() => LeaveRecord)
	// leaveRecords: LeaveRecord[];

	// Define the hook
	@AfterSync
	static async insertSampleData() {
		// Check if there are any records in the table
		const count = await LeaveCategory.count();
		if (count === 0) {
			// Insert sample data
			try {
				await LeaveCategory.bulkCreate(
					[
						{ leaveType: 'Vacation Leave', description: 'Time off for planned vacations and holidays' },
						{ leaveType: 'Sick Leave', description: 'Time off due to illness or medical conditions' },
						{ leaveType: 'Personal Leave', description: 'Non-medical time off for personal reasons' },
						{ leaveType: 'Vacation Leave', description: 'Time off for planned vacations and holidays' },
						{ leaveType: 'Sick Leave', description: 'Time off due to illness or medical conditions' },
						{ leaveType: 'Personal Leave', description: 'Non-medical time off for personal reasons' },
						{ leaveType: 'Public Holidays', description: 'Automatically allocated time off for recognized public holidays' },
						{ leaveType: 'Maternity Leave', description: 'Time off for expectant mothers before and after childbirth' },
						{ leaveType: 'Paternity Leave', description: 'Time off for new fathers to support their partner and bond with the newborn' },
						{ leaveType: 'Parental Leave', description: 'Time off for parents to care for a newborn or adopted child' },
						{ leaveType: 'Bereavement Leave', description: 'Time off due to the death of a family member or close friend' },
						{ leaveType: 'Jury Duty Leave', description: 'Time off to fulfill civic duty by serving on a jury' },
						{ leaveType: 'Compensatory Time Off', description: 'Time off granted in lieu of overtime pay' },
						{ leaveType: 'Unpaid Leave', description: 'Extended time off without pay for specific reasons' },
						{ leaveType: 'Educational Leave', description: 'Time off for employees to pursue educational opportunities' },
						{
							leaveType: 'Volunteer Time Off',
							description: 'Time off for employees to engage in volunteer or community service activities',
						},
						{ leaveType: 'Administrative Leave', description: 'Time off for administrative reasons, such as office closures' },
						{ leaveType: 'Work from Home (WFH)', description: 'Time spent working remotely or from home' },
						{ leaveType: 'Half-Day Leave', description: 'A partial day off for specific situations' },
						{ leaveType: 'Sabbatical Leave', description: 'Extended leave granted for personal or professional development' },
						{ leaveType: 'Leave Without Pay (LWOP)', description: 'Extended time off without receiving salary or wages' },
						// Add more sample data as needed
					],
					{ logging: false },
				);
				this.logger.debug('default values have been entered into LeaveCategory entity');
			} catch (error) {
				this.logger.error('error inserting values into LeaveCategory entity');
			}
		}
	}
}
