import { Test, TestingModule } from '@nestjs/testing';
import { LeaveCategoryController } from './leave-category.controller';
import { LeaveCategoryService } from './leave-category.service';

describe('LeaveCategoryController', () => {
  let controller: LeaveCategoryController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [LeaveCategoryController],
      providers: [LeaveCategoryService],
    }).compile();

    controller = module.get<LeaveCategoryController>(LeaveCategoryController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
