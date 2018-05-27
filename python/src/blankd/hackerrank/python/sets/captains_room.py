# https://www.hackerrank.com/challenges/py-the-captains-room
if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        group_size = f.readline()
        room_nums = map(int, f.readline().split())
        unique_nums = set()
        repeat_nums = set()

        for n in room_nums:
            if n in unique_nums:
                repeat_nums.add(n)
            else:
                unique_nums.add(n)
        print(unique_nums.difference(repeat_nums).pop())
