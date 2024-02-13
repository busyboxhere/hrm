import { Test, TestingModule } from '@nestjs/testing';
import { LeaveRecordController } from './leave-record.controller';
import { LeaveRecordService } from './leave-record.service';

describe('LeaveRecordController', () => {
  let controller: LeaveRecordController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [LeaveRecordController],
      providers: [LeaveRecordService],
    }).compile();

    controller = module.get<LeaveRecordController>(LeaveRecordController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
