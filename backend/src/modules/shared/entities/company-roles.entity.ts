/* eslint-disable prettier/prettier */

import { Logger } from '@nestjs/common';
import { AfterSync, Column, DataType, HasMany, Model, Table } from 'sequelize-typescript';
import { EmploymentHistory } from 'src/modules/employee/entity/employment-history.entity';

@Table({
	tableName: 'CompanyRolesEntity',
})
export class CompanyRolesEntity extends Model {
	private static readonly logger = new Logger(CompanyRolesEntity.name);
	@Column({ primaryKey: true, autoIncrement: true, type: DataType.INTEGER })
	roleId: number;

	@Column({ allowNull: false, type: DataType.STRING })
	roleName: string;

	@Column({ allowNull: false, type: DataType.STRING })
	category: string;

	@Column({ allowNull: false, type: DataType.STRING })
	description: string;

	@HasMany(() => EmploymentHistory)
	employmentHistory: EmploymentHistory[];

	@AfterSync
	static async insertDefaultValues() {
		if (CompanyRolesEntity.count()) {
			try {
				await CompanyRolesEntity.bulkCreate(
					[
						{
							roleName: 'Chief Executive Officer',
							category: 'Executive Leadership',
							description: 'The CEO is responsible for the overall strategic direction and success of the company.',
						},
						{
							roleName: 'Chief Operating Officer',
							category: 'Executive Leadership',
							description: 'Responsible for the day-to-day operations and performance of the company.',
						},
						{
							roleName: 'Chief Financial Officer',
							category: 'Executive Leadership',
							description: 'Oversees the financial operations and strategy of the organization.',
						},
						{
							roleName: 'Chief Technology Officer',
							category: 'Executive Leadership',
							description: "Leads the development and implementation of the company's technology strategy.",
						},
						{
							roleName: 'Chief Marketing Officer',
							category: 'Executive Leadership',
							description: "Develops and executes marketing strategies to promote the company's products or services.",
						},
						{
							roleName: 'Chief Human Resources Officer',
							category: 'Executive Leadership',
							description: 'Manages the human resources function, including recruitment, training, and employee relations.',
						},
						{
							roleName: 'Chief Information Officer',
							category: 'Executive Leadership',
							description: "Oversees the company's information technology strategy and implementation.",
						},
						{
							roleName: 'Chief Information Security Officer',
							category: 'Executive Leadership',
							description: "Responsible for the overall security of the company's information systems.",
						},
						{
							roleName: 'Operations Manager',
							category: 'Operations',
							description: 'Manages day-to-day operations to ensure efficiency and effectiveness.',
						},
						{
							roleName: 'Project Manager',
							category: 'Operations',
							description: 'Coordinates and manages projects to achieve organizational goals.',
						},
						{
							roleName: 'Supply Chain Manager',
							category: 'Operations',
							description: 'Oversees the management of the supply chain and logistics processes.',
						},
						{
							roleName: 'Logistics Coordinator',
							category: 'Operations',
							description: "Coordinates and facilitates the logistical aspects of the company's operations.",
						},
						{
							roleName: 'Facilities Manager',
							category: 'Operations',
							description: 'Manages the facilities and ensures a safe and efficient working environment.',
						},
						{
							roleName: 'Accountant',
							category: 'Finance',
							description: 'Responsible for financial record-keeping, analysis, and reporting.',
						},
						{
							roleName: 'Financial Analyst',
							category: 'Finance',
							description: 'Analyzes financial data and provides insights to support decision-making.',
						},
						{
							roleName: 'Treasurer',
							category: 'Finance',
							description: "Manages the organization's finances, investments, and cash flow.",
						},
						{
							roleName: 'Controller',
							category: 'Finance',
							description: 'Oversees the financial reporting and compliance of the organization.',
						},
						{
							roleName: 'Budget Analyst',
							category: 'Finance',
							description: "Assists in the development and management of the company's budget.",
						},
						{
							roleName: 'Human Resources Manager',
							category: 'Human Resources',
							description: 'Manages human resources functions, including staffing, employee relations, and policy implementation.',
						},
						{
							roleName: 'Recruiter',
							category: 'Human Resources',
							description: 'Identifies and recruits qualified candidates for open positions within the organization.',
						},
						{
							roleName: 'Training and Development Specialist',
							category: 'Human Resources',
							description: 'Designs and implements training programs to enhance employee skills and knowledge.',
						},
						{
							roleName: 'Compensation and Benefits Specialist',
							category: 'Human Resources',
							description: 'Develops and administers compensation and benefits programs for employees.',
						},
						{
							roleName: 'Employee Relations Specialist',
							category: 'Human Resources',
							description: 'Handles employee relations matters and fosters a positive work environment.',
						},
						{
							roleName: 'Sales Representative',
							category: 'Sales and Marketing',
							description: "Engages with potential customers to promote and sell the company's products or services.",
						},
						{
							roleName: 'Marketing Manager',
							category: 'Sales and Marketing',
							description: "Plans and oversees marketing strategies to promote the company's products or services.",
						},
						{
							roleName: 'Product Manager',
							category: 'Sales and Marketing',
							description: 'Manages the development and lifecycle of a product, from ideation to market launch.',
						},
						{
							roleName: 'Public Relations Specialist',
							category: 'Sales and Marketing',
							description: 'Cultivates a positive public image for the company through media relations and communications.',
						},
						{
							roleName: 'Social Media Manager',
							category: 'Sales and Marketing',
							description:
								"Manages the company's presence on social media platforms, creating and curating content to engage the audience.",
						},
						{
							roleName: 'IT Manager',
							category: 'Information Technology',
							description: "Oversees the company's information technology infrastructure and systems.",
						},
						{
							roleName: 'Network Administrator',
							category: 'Information Technology',
							description: "Manages and maintains the organization's computer networks and systems.",
						},
						{
							roleName: 'Systems Analyst',
							category: 'Information Technology',
							description: "Analyzes and designs information systems to meet the company's business needs.",
						},
						{
							roleName: 'Software Developer',
							category: 'Information Technology',
							description: 'Designs, develops, and maintains software applications for the company.',
						},
						{
							roleName: 'Database Administrator',
							category: 'Information Technology',
							description: "Manages and maintains the company's databases, ensuring data integrity and availability.",
						},
						{
							roleName: 'Customer Service Representative',
							category: 'Customer Support',
							description: 'Assists customers with inquiries, resolves issues, and ensures overall customer satisfaction.',
						},
						{
							roleName: 'Customer Success Manager',
							category: 'Customer Support',
							description: "Manages customer relationships, ensuring they derive maximum value from the company's products or services.",
						},
						{
							roleName: 'Technical Support Specialist',
							category: 'Customer Support',
							description: 'Provides technical assistance and support to customers experiencing software or hardware issues.',
						},
						{
							roleName: 'Research Scientist',
							category: 'Research and Development',
							description: 'Conducts scientific research to contribute to the development of new products or technologies.',
						},
						{
							roleName: 'Product Development Engineer',
							category: 'Research and Development',
							description: 'Designs and develops new products, ensuring they meet quality and performance standards.',
						},
						{
							roleName: 'Research and Development Manager',
							category: 'Research and Development',
							description: 'Manages the overall research and development activities of the company.',
						},
						{
							roleName: 'General Counsel',
							category: 'Legal',
							description: 'Provides legal advice, manages legal affairs, and ensures compliance with laws and regulations.',
						},
						{
							roleName: 'Legal Counsel',
							category: 'Legal',
							description: 'Assists in legal matters, drafts contracts, and provides legal support to the organization.',
						},
						{
							roleName: 'Paralegal',
							category: 'Legal',
							description: 'Assists lawyers in legal research, document preparation, and general legal support.',
						},
						{
							roleName: 'Administrative Assistant',
							category: 'Administration',
							description: 'Provides administrative support, including scheduling, correspondence, and office organization.',
						},
						{
							roleName: 'Office Manager',
							category: 'Administration',
							description: 'Manages administrative tasks, office operations, and supports overall organizational efficiency.',
						},
						{
							roleName: 'Executive Assistant',
							category: 'Administration',
							description: 'Provides high-level administrative support to executives, handling tasks and ensuring smooth operations.',
						},
						{
							roleName: 'Quality Assurance Analyst',
							category: 'Quality Assurance',
							description: 'Tests and ensures the quality of software or products before release.',
						},
						{
							roleName: 'Quality Control Inspector',
							category: 'Quality Assurance',
							description: 'Inspects and tests products to ensure they meet quality standards.',
						},
						{
							roleName: 'Health and Safety Officer',
							category: 'Health and Safety',
							description: 'Ensures compliance with health and safety regulations, creating and implementing safety programs.',
						},
						{
							roleName: 'Environmental Health and Safety Specialist',
							category: 'Health and Safety',
							description: 'Focuses on environmental health and safety issues, ensuring compliance with regulations.',
						},
						{
							roleName: 'Graphic Designer',
							category: 'Creative and Design',
							description: 'Creates visual concepts and designs for various marketing materials.',
						},
						{
							roleName: 'UX/UI Designer',
							category: 'Creative and Design',
							description: 'Designs user interfaces and experiences to enhance product usability.',
						},
						{
							roleName: 'Creative Director',
							category: 'Creative and Design',
							description: 'Oversees the creative direction and visual identity of the company.',
						},
						{
							roleName: 'Production Manager',
							category: 'Manufacturing/Production',
							description: 'Manages the production process, ensuring efficiency and quality.',
						},
						{
							roleName: 'Manufacturing Engineer',
							category: 'Manufacturing/Production',
							description: 'Designs and improves manufacturing processes for efficiency and quality.',
						},
						{
							roleName: 'Assembly Line Worker',
							category: 'Manufacturing/Production',
							description: 'Performs tasks in the assembly line to produce goods.',
						},
						{
							roleName: 'Data Analyst',
							category: 'Business Support',
							description: 'Analyzes and interprets complex data sets to provide insights for decision-making.',
						},
						{
							roleName: 'Business Analyst',
							category: 'Business Support',
							description: 'Analyzes business processes and systems to recommend improvements.',
						},
						{
							roleName: 'Compliance Officer',
							category: 'Business Support',
							description: 'Ensures the company complies with relevant laws and regulations.',
						},
						{
							roleName: 'Communications Specialist',
							category: 'Business Support',
							description: "Manages internal and external communications to promote the company's image.",
						},
					],
					{ logging: false },
				);
				this.logger.debug('successfully entered data into CompanyRolesEntity');
			} catch (error) {
				this.logger.error('error while entering default data set into CompanyRolesEntity', error);
			}
		}
	}
}
