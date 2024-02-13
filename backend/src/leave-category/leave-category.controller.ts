import { Controller, Get, Post, Body, Patch, Param, Delete } from '@nestjs/common';
import { LeaveCategoryService } from './leave-category.service';
import { CreateLeaveCategoryDto } from './dto/create-leave-category.dto';
import { UpdateLeaveCategoryDto } from './dto/update-leave-category.dto';

@Controller('leave-category')
export class LeaveCategoryController {
  constructor(private readonly leaveCategoryService: LeaveCategoryService) {}

  @Post()
  create(@Body() createLeaveCategoryDto: CreateLeaveCategoryDto) {
    return this.leaveCategoryService.create(createLeaveCategoryDto);
  }

  @Get()
  findAll() {
    return this.leaveCategoryService.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.leaveCategoryService.findOne(+id);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updateLeaveCategoryDto: UpdateLeaveCategoryDto) {
    return this.leaveCategoryService.update(+id, updateLeaveCategoryDto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.leaveCategoryService.remove(+id);
  }
}
