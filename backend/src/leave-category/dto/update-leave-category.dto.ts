import { PartialType } from '@nestjs/mapped-types';
import { CreateLeaveCategoryDto } from './create-leave-category.dto';

export class UpdateLeaveCategoryDto extends PartialType(CreateLeaveCategoryDto) {}
