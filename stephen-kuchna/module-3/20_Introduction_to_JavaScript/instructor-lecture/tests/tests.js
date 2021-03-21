let should = chai.should();

describe('Lecture', () =>
{
  describe('Hello There', () =>
  {
    it("should take 'Hello' and 'There' and return 'ellohere'", () =>
    {
      // arrange

      // act
      // assert
      nonStart('Hello', 'There').should.equal('hellothere');
    });

    it("should take 'Java' and 'Code' and return 'avaode'", () =>
    {
      nonStart('Java', 'Code').should.equal('avaode');
    });
  });
});
