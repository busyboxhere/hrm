import { Injectable } from '@nestjs/common';
import { CreateEmploymentHistoryDto } from './dto/create-employment-history.dto';
import { UpdateEmploymentHistoryDto } from './dto/update-employment-history.dto';

@Injectable()
export class EmploymentHistoryService {
  create(createEmploymentHistoryDto: CreateEmploymentHistoryDto) {
    return 'This action adds a new employmentHistory';
  }

  findAll() {
    return `This action returns all employmentHistory`;
  }

  findOne(id: number) {
    return `This action returns a #${id} employmentHistory`;
  }

  update(id: number, updateEmploymentHistoryDto: UpdateEmploymentHistoryDto) {
    return `This action updates a #${id} employmentHistory`;
  }

  remove(id: number) {
    return `This action removes a #${id} employmentHistory`;
  }
}
