#!/usr/bin/env python

import sys

number = input("enter a number")
divisors = []
for x in range(1,number/2) :
	if number%x == 0:
		divisors.append(x)
print(divisors)	

