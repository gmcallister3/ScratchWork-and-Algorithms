#!/usr/bin/python


def histogram(*varInts):
	print "Histogram:"
	for i in varInts:
		print i, ": " + "*" * i;



histogram(1, 2, 5, 10, 15)