import { Test, TestingModule } from '@nestjs/testing';
import { LeaveRecordService } from './leave-record.service';

describe('LeaveRecordService', () => {
  let service: LeaveRecordService;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [LeaveRecordService],
    }).compile();

    service = module.get<LeaveRecordService>(LeaveRecordService);
  });

  it('should be defined', () => {
    expect(service).toBeDefined();
  });
});
