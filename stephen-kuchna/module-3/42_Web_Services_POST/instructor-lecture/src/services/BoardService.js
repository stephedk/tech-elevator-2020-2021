import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  getBoards() {
    return http.get('/boards');
  },

  addBoard(board)
  {
    if (board.title == '')
    {
      return http.post('http://localhost:9999/boards', board);
    }
    else
    {
      return http.post('/boards', board);
    }
  },

  deleteBoard(boardId)
  {
    return http.delete(`/boards/${ boardId }`);
  },

  getCards(boardID) {
    return http.get(`/boards/${boardID}`)
  },

  getCard(cardID) {
    return http.get(`/cards/${cardID}`)
  },

  addCard(card) {
    return http.post('/cards', card);
  },

  updateCard(card) {
    return http.put(`/cards/${card.id}`, card);
  },

  deleteCard(cardID) {
    return http.delete(`/cards/${cardID}`);
  }

}
