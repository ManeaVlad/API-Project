-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Location
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Location
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Location` DEFAULT CHARACTER SET utf8 ;
USE `Location` ;

-- -----------------------------------------------------
-- Table `Location`.`location_table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Location`.`location_table` (
  `location_id` INT NOT NULL AUTO_INCREMENT,
  `location_name` VARCHAR(45) NOT NULL,
  `location_longitude` INT NOT NULL,
  `location_latitude` INT NOT NULL,
  `location_windprobability` INT NOT NULL,
  `location_country` VARCHAR(45) NOT NULL,
  `location_whentogo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`location_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Location`.`user_table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Location`.`user_table` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(45) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `user_phoneno` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Location`.`favourites_table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Location`.`favourites_table` (
  `favourites_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `location_id` INT NOT NULL,
  PRIMARY KEY (`favourites_id`),
  INDEX `Fk_Favourites_1_idx` (`user_id` ASC) ,
  INDEX `Fk_Favourites_2_idx` (`location_id` ASC) ,
  CONSTRAINT `Fk_Favourites_1`
    FOREIGN KEY (`user_id`)
    REFERENCES `Location`.`user_table` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `Fk_Favourites_2`
    FOREIGN KEY (`location_id`)
    REFERENCES `Location`.`location_table` (`location_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
