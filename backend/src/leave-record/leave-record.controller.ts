import { Controller, Get, Post, Body, Patch, Param, Delete } from '@nestjs/common';
import { LeaveRecordService } from './leave-record.service';
import { CreateLeaveRecordDto } from './dto/create-leave-record.dto';
import { UpdateLeaveRecordDto } from './dto/update-leave-record.dto';

@Controller('leave-record')
export class LeaveRecordController {
  constructor(private readonly leaveRecordService: LeaveRecordService) {}

  @Post()
  create(@Body() createLeaveRecordDto: CreateLeaveRecordDto) {
    return this.leaveRecordService.create(createLeaveRecordDto);
  }

  @Get()
  findAll() {
    return this.leaveRecordService.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.leaveRecordService.findOne(+id);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updateLeaveRecordDto: UpdateLeaveRecordDto) {
    return this.leaveRecordService.update(+id, updateLeaveRecordDto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.leaveRecordService.remove(+id);
  }
}
