# https://www.hackerrank.com/challenges/py-set-discard-remove-pop
REMOVE_CMD = "remove"
POP_CMD = "pop"
DISCARD_CMD = "discard"
CMD_IND = 0
ITEM_IND = 1

if __name__ == '__main__':
    with open("path/to/file.txt") as f:
        lines = f.readlines()
        total = int(lines[0])
        the_set = set(map(int, lines[1].split()))
        all_cmds = int(lines[2])
        for cmd in range(3, len(lines)):
            all_info = lines[cmd].split()
            if all_info[CMD_IND] == REMOVE_CMD or all_info[CMD_IND] == DISCARD_CMD:
                the_set.discard(int(all_info[ITEM_IND]))
            elif all_info[CMD_IND] == POP_CMD:
                the_set.pop()
        print(sum(set(the_set)))
