let should = chai.should();

describe('Challenge Exercises', () => {
  describe('IQ Test', () => {
    it('should be 3 when third number is only one not even', () => {
      iqTest('2 4 7 8 10').should.equal(3);
    });
    it('should be 2 when second number is only one even', () => {
      iqTest('1 2 1 1').should.equal(2);
    });
    it('should be 0 when no numbers are given', () => {
      iqTest('').should.equal(0);
    });
    it('should be 0 when all numbers are even', () => {
      iqTest('2 2 4 6').should.equal(0);
    });
  });

});
