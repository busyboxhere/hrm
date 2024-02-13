import { Injectable } from '@nestjs/common';
import { CreateLeaveCategoryDto } from './dto/create-leave-category.dto';
import { UpdateLeaveCategoryDto } from './dto/update-leave-category.dto';

@Injectable()
export class LeaveCategoryService {
  create(createLeaveCategoryDto: CreateLeaveCategoryDto) {
    return 'This action adds a new leaveCategory';
  }

  findAll() {
    return `This action returns all leaveCategory`;
  }

  findOne(id: number) {
    return `This action returns a #${id} leaveCategory`;
  }

  update(id: number, updateLeaveCategoryDto: UpdateLeaveCategoryDto) {
    return `This action updates a #${id} leaveCategory`;
  }

  remove(id: number) {
    return `This action removes a #${id} leaveCategory`;
  }
}
