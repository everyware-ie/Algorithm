def solution(sizes):
    answer = 0
    height = []
    weight = []

    for size in sizes:
        h, w = size
        if h < w:
            height.append(size[0])
            weight.append(size[1])
        else:
            height.append(size[1])
            weight.append(size[0])
    return max(height) * max(weight)


print(solution([[60, 50], [30, 70], [60, 30], [80, 40]]))
