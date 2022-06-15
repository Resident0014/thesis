#!/usr/bin/perl
while (<@ARGV>)
  { $sum += 1/($_*$_); }
print sqrt(1/$sum), "\n";
