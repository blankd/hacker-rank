'''
Created on Jun 11, 2017

@author: blankd
'''
def print_formatted(number): 
  binPad = len('{0:b}'.format(int(number)))
  for n in xrange(int(number)):
    print str(n+1).rjust(binPad)+'{0:o}'.format(n+1).rjust(binPad+1)+'{0:X}'.format(n+1).rjust(binPad+1)+'{0:b}'.format(n+1).rjust(binPad+1)
    
if __name__ == '__main__':
  print_formatted(raw_input())
  pass #Do something