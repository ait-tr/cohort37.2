const divElement1 = document.querySelector('#img');
const imgSize = document.querySelector('#text');



const addImageToPage = (imgSrc) => {
    const handleOnImgLoad = () => {
        const imgWidth = imgElement.width;
        console.log(imgWidth);
        return imgWidth;
    }

    const imgElement = document.createElement('img');
    imgElement.src = 'https://images.pexels.com/photos/631317/pexels-photo-631317.jpeg';
    divElement1.append(imgElement);

    const imgWidth = imgElement.width;
    
    imgElement.addEventListener('load', handleOnImgLoad);
    imgSize.append(imgWidth);
    
    // return imgWidth;
}

addImageToPage();



const addImageSizes = (w) => {
    imgSize.append(w);
}

addImageSizes();