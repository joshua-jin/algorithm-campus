struct mat {
    int a11, a12;
    int a21, a22;
};

mat mat_mul(const mat &a, const mat &b) {
    mat ret = {
        a.a11*b.a11 + a.a12*b.a21, a.a11*b.a12 + a.a12*b.a22,
        a.a21*b.a11 + a.a22*b.a21, a.a21*b.a12 + a.a22*b.a22,
    };
    return ret;
}

mat mat_pow(const mat &a, int pow) {
    if (pow == 0) {
        mat ret = { 1, 0, 0, 1};
        return ret;
    } else if (pow == 1) {
        return a;
    } else if (pow % 2 == 1) {
        return mat_mul(a, mat_pow(a, pow - 1));
    } else {
        mat tmp = mat_mul(a, a);
        return mat_pow(tmp, pow / 2);
    }
}

class Solution {
public:
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    int fibonacci(int n) {
        mat a = { 1, 1, 1, 0 };
        mat res = mat_pow(a, n - 1);
        return res.a12;
    }
};
