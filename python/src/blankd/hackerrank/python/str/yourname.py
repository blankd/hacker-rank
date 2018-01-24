'''
Created on Jun 11, 2017

@author: blankd
https://www.hackerrank.com/challenges/whats-your-name
'''

#No need to one line this in a file
def print_full_name(fname, lname):
  strTemplate = "Hello %s %s! You just delved into python."
  print strTemplate % (fname, lname)
  
if __name__ == '__main__':
  print_full_name(raw_input(), raw_input())