import { Controller, Get, Post, Body, Patch, Param, Delete } from '@nestjs/common';
import { EmploymentHistoryService } from './employment-history.service';
import { CreateEmploymentHistoryDto } from './dto/create-employment-history.dto';
import { UpdateEmploymentHistoryDto } from './dto/update-employment-history.dto';

@Controller('employment-history')
export class EmploymentHistoryController {
  constructor(private readonly employmentHistoryService: EmploymentHistoryService) {}

  @Post()
  create(@Body() createEmploymentHistoryDto: CreateEmploymentHistoryDto) {
    return this.employmentHistoryService.create(createEmploymentHistoryDto);
  }

  @Get()
  findAll() {
    return this.employmentHistoryService.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.employmentHistoryService.findOne(+id);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updateEmploymentHistoryDto: UpdateEmploymentHistoryDto) {
    return this.employmentHistoryService.update(+id, updateEmploymentHistoryDto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.employmentHistoryService.remove(+id);
  }
}
