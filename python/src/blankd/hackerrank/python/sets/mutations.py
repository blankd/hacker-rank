# https://www.hackerrank.com/challenges/py-set-mutations
INTERSECTION_UPDATE_CMD = "intersection_update"
UPDATE_CMD = "update"
SYMMETRIC_DIFF_CMD = "symmetric_difference_update"
DIFF_UPDATE = "difference_update"

CMD_IND = 0
if __name__ == '__main__':
    with open("path/to/test/data.txt") as f:
        worthless_one = f.readline().strip()
        set_one = set(map(int, f.readline().split()))
        total_cmds = int(f.readline())
        for c in range(total_cmds):
            cmd = f.readline().split()
            a_set = set(map(int, f.readline().split()))
            if cmd[CMD_IND] == INTERSECTION_UPDATE_CMD:
                set_one.intersection_update(a_set)
            elif cmd[CMD_IND] == UPDATE_CMD:
                set_one.update(a_set)
            elif cmd[CMD_IND] == SYMMETRIC_DIFF_CMD:
                set_one.symmetric_difference_update(a_set)
            elif cmd[CMD_IND] == DIFF_UPDATE:
                set_one.difference_update(a_set)

        print(sum(set_one))
