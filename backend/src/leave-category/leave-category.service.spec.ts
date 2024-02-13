import { Test, TestingModule } from '@nestjs/testing';
import { LeaveCategoryService } from './leave-category.service';

describe('LeaveCategoryService', () => {
  let service: LeaveCategoryService;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [LeaveCategoryService],
    }).compile();

    service = module.get<LeaveCategoryService>(LeaveCategoryService);
  });

  it('should be defined', () => {
    expect(service).toBeDefined();
  });
});
