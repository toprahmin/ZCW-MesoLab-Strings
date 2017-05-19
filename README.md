# String Lab 1

## Objectives

1. At the end of this lab students should be intimately familiar with many of the commonly used String methods
2. Upon completing this lab, students will have extensively practiced manipulating and generating Strings of various sorts.


## Overview

This lab will help you to become more familiar with the various methods available for working with strings.

## Unit Test

You should write tests for the intended behavior of your code to check that your implementation meets the specifications below.

## Instructions

### Part 1:

Add a static `deserializeFromCSV` method to the Driver's License (from the lecture), which takes a string representing the contents of a CSV file produced using `getCSVHeader` and `serializeToCSV` and reproduces a `List` of Driver's License objects that match the contents of the file. 

When done correctly you should be able to serialize any number of Driver's Licenses, and then deserialize the resultant strings (with or without having stored them in a file) and produce objects that are equivalent to the ones you started with *hinthint*.

### Part 2:

Add methods for serializing to and deserializing from JSON. Once you have these methods, add new `serialize` and `deserialize` methods that take an additional string listing the desired format (CSV or JSON) and produce the desired result by delegating to the existing serialization and deserialization methods. These methods should throw an appropriate exception if an unsupported format is requested.

