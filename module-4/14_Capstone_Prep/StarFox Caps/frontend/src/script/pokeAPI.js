export default{
  list() {
    return fetch('https://pokeapi.co/api/v2/pokemon/')
    .then((response) => {
      return response.json();
    });
}
}