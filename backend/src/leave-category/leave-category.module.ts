import { Module } from '@nestjs/common';
import { LeaveCategoryService } from './leave-category.service';
import { LeaveCategoryController } from './leave-category.controller';
import { SequelizeModule } from '@nestjs/sequelize';
import { LeaveCategory } from './entities/leave-category.entity';

@Module({
	imports: [SequelizeModule.forFeature([LeaveCategory])],
	controllers: [LeaveCategoryController],
	providers: [LeaveCategoryService],
})
export class LeaveCategoryModule {}
