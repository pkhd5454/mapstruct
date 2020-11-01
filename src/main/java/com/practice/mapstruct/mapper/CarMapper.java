package com.practice.mapstruct.mapper;

import com.practice.mapstruct.dto.CarDto;
import com.practice.mapstruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
  CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

  @Mapping(source = "numberOfSeats", target = "seatCount")
  CarDto carToCarDto(Car car);
}
