const divElem1 = document.querySelector('#img');
const imgSize = document.createElement('#text');



const addImageToPage = (imgSrc) => {

    const handleOnImgLoad = () => {
        const imgWidth = imgElem.width;
        console.log(imgWidth);
        return imgWidth;
    }

const imgElem = document.createElement('img');
imgElem.src = 'https://images.pexels.com/photos/631317/pexels-photo-631317.jpeg';
divElem1.append(imgElem);
const imgWidth = imgElem.width;


imgElem.addEventListener('load', handleOnImgLoad)
return imgWidth;

}
addImageToPage();

const addImageSizes = (width) => {
    imgSize.append(width);
}
addImageSizes();