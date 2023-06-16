#using the pattern followed in the output value
# Notice that the solution array follows a pattern. Consider solution arrays of length 2^n:
# [0]
# [0, 1]
# [0, 1, 1, 2]
# [0, 1, 1, 2, 1, 2, 2, 3]
# [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4]

# The solution array for 2^(n+1) is the concatenation of the solution array for 2^n with that same array incremented by 1
# [0]
# [0, 1] = [0] + [1]
# [0, 1, 1, 2] = [0, 1] + [1, 2]
# [0, 1, 1, 2, 1, 2, 2, 3] = [0, 1, 1, 2] + [1, 2, 2, 3]
# [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4] = [0, 1, 1, 2, 1, 2, 2, 3] + [ 1, 2, 2, 3, 2, 3, 3, 4]
# ...

def countBits(self, n: int) -> List[int]:
    res = [0]
    while len(res) < (n+1):
        res.extend([a+1 for a in res])
    return res[:n+1]