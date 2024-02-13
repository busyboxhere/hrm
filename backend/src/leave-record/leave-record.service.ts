import { Injectable } from '@nestjs/common';
import { CreateLeaveRecordDto } from './dto/create-leave-record.dto';
import { UpdateLeaveRecordDto } from './dto/update-leave-record.dto';

@Injectable()
export class LeaveRecordService {
  create(createLeaveRecordDto: CreateLeaveRecordDto) {
    return 'This action adds a new leaveRecord';
  }

  findAll() {
    return `This action returns all leaveRecord`;
  }

  findOne(id: number) {
    return `This action returns a #${id} leaveRecord`;
  }

  update(id: number, updateLeaveRecordDto: UpdateLeaveRecordDto) {
    return `This action updates a #${id} leaveRecord`;
  }

  remove(id: number) {
    return `This action removes a #${id} leaveRecord`;
  }
}
